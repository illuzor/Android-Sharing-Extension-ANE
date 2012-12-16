Android-Sharing-Extension-ANE
=============================
Native Extension for Adobe AIR

Features:

	- share text
	- share image
	
How to use:

Connect com.illuzor.extensions.SharingExtension.ane file to your android air project.
Import com.illuzor.sharingextension.SharingExtension;

1) Share text:

	SharingExtension.shareText("Title", "Text for sharing");
	
2) Share image:
	
	var bitmap:Bitmap = ...;
	
	// encoding image by BloodyCrypto lib - http://www.blooddy.by/en/crypto/
	var bitmapBytes:ByteArray = JPEGEncoder.encode((new ImageForSharingClass() as Bitmap).bitmapData));
	
	var file:File = File.documentsDirectory.resolvePath("image_for_share.jpg");
	
	var stream:FileStream = new FileStream(); // write file to local memory
	stream.open(file, FileMode.WRITE);
	stream.writeBytes(fileBytes);
	stream.close();
	
	SharingExtension.shareImage(file, "Choser title"));
	
3) Dispose. If you don`t need extension after use, dispose it:

	SharingExtension.dispose();
	
Demo app - http://clck.ru/4Jj0c