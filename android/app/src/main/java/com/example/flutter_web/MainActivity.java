package com.example.flutter_web;

import android.webkit.WebResourceResponse;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceError;
import android.webkit.WebView;
import io.flutter.embedding.android.FlutterActivity;

public class MainActivity extends FlutterActivity {

    public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
        if (errorCode == -2) {
            view.loadData("", "", null);
        }
        // try {
        // view.stopLoading();
        // } catch (Exception e) {
        // }
        // try {
        // view.clearView();
        // } catch (Exception e) {
        // }

        // view.loadUrl("about:blank");
    }

    // public void onReceivedError(WebView view, int errorCode, String
    // description,
    // String failingUrl) {
    // view.post(new Runnable() {
    // public void run() {
    // view.loadUrl(
    //
    // "file:///C:/Users/Seyi/Desktop/practice/flutter/fluttertest/flutter_web/assets/errorpage.html");
    // }
    // });
    // };
    // public void onReceivedHttpError(WebView view, WebResourceRequest request,
    // WebResourceResponse errorResponse) {
    // try {
    // view.stopLoading();
    // } catch (Exception e) {
    // }
    // try {
    // view.clearView();
    // } catch (Exception e) {
    // }

    // view.loadUrl("about:blank");
    // }
}
