package com.illuzor.sharingextension;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREExtension;

public class SharingExtension implements FREExtension {
	
	SharingExtensionContext context;

	@Override
	public FREContext createContext(String arg0) {
		context = new SharingExtensionContext();
		return context;
	}

	@Override
	public void dispose() {
		context.dispose();
		context = null;
	}

	@Override
	public void initialize() {
		// TODO Auto-generated method stub

	}

}
