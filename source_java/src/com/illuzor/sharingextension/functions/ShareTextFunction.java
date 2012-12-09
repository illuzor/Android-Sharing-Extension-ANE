package com.illuzor.sharingextension.functions;

import android.content.Intent;

import com.adobe.fre.*;

public class ShareTextFunction implements FREFunction {

	@Override
	public FREObject call(FREContext context, FREObject[] args) {
		try {
			String title = args[0].getAsString();
			String message = args[1].getAsString();
			
			Intent sharingIntent = new Intent(Intent.ACTION_SEND);
			sharingIntent.setType("text/plain");
			sharingIntent.putExtra(Intent.EXTRA_TEXT, message);
			context.getActivity().startActivity(Intent.createChooser(sharingIntent, title));
		} catch (Exception e) {
			e.printStackTrace();
		} 

		return null;
	}

}
