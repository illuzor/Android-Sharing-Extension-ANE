package com.illuzor.sharingextension.functions;

import android.content.Intent;
import android.net.Uri;

import com.adobe.fre.*;

public class ShareImageFunction implements FREFunction {

	@Override
	public FREObject call(FREContext context, FREObject[] args) {
		try {
			String imagePath = args[0].getAsString();
			String title = args[1].getAsString();
			String message = args[2].getAsString();
			
			Intent sharingIntent = new Intent(Intent.ACTION_SEND);
			sharingIntent.setType("image/*");
			sharingIntent.putExtra(Intent.EXTRA_STREAM, Uri.parse("file://" + imagePath));
			if(message.length() > 0 )sharingIntent.putExtra(Intent.EXTRA_TEXT, message);
			context.getActivity().startActivity(Intent.createChooser(sharingIntent, title));
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		return null;
	}

}
