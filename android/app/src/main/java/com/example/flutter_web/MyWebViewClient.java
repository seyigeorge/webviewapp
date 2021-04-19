// package com.example.flutter_web;

// import android.webkit.WebResourceResponse;
// import android.webkit.WebResourceRequest;
// import android.webkit.WebResourceError;
// import android.webkit.WebView;
// import io.flutter.embedding.android.WebViewClient;

// public class MyWebViewClient extends WebViewClient {

// @Override
// public void onCreate(Bundle savedInstanceState) {
// super.onCreate(savedInstanceState);
// setContentView(R.layout.loading_image_mn);
// // To exit
// if (getIntent().getBooleanExtra("EXIT", false)) {
// SplashScreenActivity.this.finish();
// System.exit(0);
// }
// }

// @Override
// public void onReceivedError(WebView view, int errorCode, String description,
// String failingUrl) {
// // To Prevent Web page not available
// if (errorCode == -2) {
// view.loadData("", "", null);
// // To Show Alert Dialog
// // SplashScreenActivity.class is the Launcher Activity
// // In Case of Frament instead of Activity Replace ClassName.this and
// // getApplicationContext() with getActivity()

// AlertDialog.Builder builder = new AlertDialog.Builder(ClassName.this);
// builder.setCancelable(false);
// builder.setTitle(Html.fromHtml("<font color='#7F02AE'><b>Star
// Cineplex</b></font>"));
// builder.setMessage(Html.fromHtml(
// "<font color='#120049'>Your data services are not working.Please check your
// data services.</font>"));
// builder.setPositiveButton(Html.fromHtml("<font
// color='#7F02AE'><b>OK</b></font>"),
// new DialogInterface.OnClickListener() {

// @Override
// public void onClick(DialogInterface dialog, int which) {
// // SplashScreenActivity.class is your Launcher Activity
// // In Case of Fragment instead of Activity Replace getApplicationContext()
// with
// // getActivity()

// Intent intent = new Intent(getApplicationContext(),
// SplashScreenActivity.class);
// intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
// intent.putExtra("EXIT", true);
// startActivity(intent);

// }
// });
// AlertDialog alert = builder.create();
// alert.show();
// }
// }
// }
