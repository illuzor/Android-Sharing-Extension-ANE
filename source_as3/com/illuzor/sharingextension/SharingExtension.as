package com.illuzor.sharingextension {
	
	import flash.external.ExtensionContext;
	import flash.filesystem.File;
	
	/**
	 * ...
	 * @author illuzor
	 */
	
	public class SharingExtension {
		
		private static var context:ExtensionContext;
		
		private static function init():void {
			context = ExtensionContext.createExtensionContext("com.illuzor.extensions.SharingExtension", null);
		}
		
		public static function shareText(title:String, message:String):void {
			if (!context) init();
			context.call("shareText", title, message);
		}
		
		public static function shareImage(imageFile:File, title:String):void {
			if (!context) init();
			if (imageFile.exists) {
				context.call("shareImage", imageFile.nativePath, title);
			} else {
				throw new Error("File " + imageFile.nativePath + " not exists");
			}
		}
		
		public static function dispose():void {
			if (context) {
				context.dispose();
				context = null;
			}
		}
		
	}
}