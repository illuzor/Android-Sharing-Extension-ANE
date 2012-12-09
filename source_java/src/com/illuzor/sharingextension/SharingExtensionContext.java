package com.illuzor.sharingextension;

import java.util.HashMap;
import java.util.Map;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.illuzor.sharingextension.functions.ShareImageFunction;
import com.illuzor.sharingextension.functions.ShareTextFunction;

public class SharingExtensionContext extends FREContext {

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public Map<String, FREFunction> getFunctions() {
		Map<String, FREFunction> map = new HashMap<String, FREFunction>();
		map.put("shareText", new ShareTextFunction());
		map.put("shareImage", new ShareImageFunction());
		return map;
	}

}
