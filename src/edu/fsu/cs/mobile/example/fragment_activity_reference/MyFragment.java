package edu.fsu.cs.mobile.example.fragment_activity_reference;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MyFragment extends Fragment {
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle state) {
		
		return inflater.inflate(R.layout.fragment_ui, null);
		
	}

	@Override
	public void onActivityCreated(Bundle state) {
		
		super.onStart();
		TextView edit1 = (TextView) getActivity().findViewById(R.id.textView1);
		TextView edit2 = (TextView) getActivity().findViewById(R.id.textView2);
		edit1.setText("I was set from Fragment, not directly from an Activity!");
		edit2.setText("Me too!");
		
	}
}
