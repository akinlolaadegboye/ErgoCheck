package com.example.ergocheck.Activities;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ergocheck.HelperClass.AppUtilityClass;
import com.example.ergocheck.R;

import java.util.ArrayList;


public class DiagnosisCustomAdapter extends BaseAdapter {
	Context context;
	ArrayList<DiagnosisItems> arraylist;
	public DiagnosisCustomAdapter(Context context, ArrayList<DiagnosisItems> arraylist) {
		this.context = context;
		this.arraylist = arraylist;
	}

	@Override
	public int getCount() {
		return arraylist.size();
	}

	@Override
	public Object getItem(int arg0) {
		return arraylist.get(arg0);
	}

	@Override
	public long getItemId(int pos) {
		return pos;
	}

	@Override
	public View getView(final int position, View view, ViewGroup parent) {
		
		ViewHolder holder = null;
		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		if (view == null) {
			view = inflater.inflate(R.layout.diagnosis_items, parent, false);
			holder = new ViewHolder();
			holder.titleTextView = (TextView) view.findViewById(R.id.title);
			holder.image = (ImageView) view.findViewById(R.id.image);
			view.setTag(holder);
		} else holder = (ViewHolder) view.getTag();

		
		final String title = arraylist.get(position).getTitle();
		byte[] image_ = arraylist.get(position).getImage();
		holder.titleTextView.setText(title);
		holder.image.setImageBitmap(AppUtilityClass.getImage(image_));

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            	if(title.equalsIgnoreCase("Body Pains")){
				GoToDiagnosisClass();
				}
				else{
				GoToRecommendationDisplayClass(position);
				}
            }
        });
		return view;
	}

	
	public class ViewHolder {
		TextView titleTextView;
		ImageView image;
	}

	void GoToDiagnosisClass(){
		Intent intent = new Intent(context, Diagnosis.class);
		intent.putExtra("number","4");
		intent.putExtra("from","adapter");
		intent.putExtra("machineUsed","Sealing machine");
		context.startActivity(intent);
	}

	void GoToRecommendationDisplayClass(int position){
		Intent intent = new Intent(context, RecommendationDisplay.class);
		intent.putExtra("recommendationString",arraylist.get(position).getRecommendation());
		intent.putExtra("from","notAdapter");
		context.startActivity(intent);
	}
}
