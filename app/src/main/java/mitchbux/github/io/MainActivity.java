package mitchbux.github.io;

import android.app.*;
import android.os.*;
import android.webkit.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        
		setContentView(R.layout.main);
		
		WebView webView = (WebView) findViewById(R.id.webview);
		webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);

        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);

        webView.setScrollBarStyle(WebView.SCROLLBARS_OUTSIDE_OVERLAY);
        setDesktopMode(webView, true);
		webView.loadUrl("https://dyper.danycase.repl.it/reload.html");
		
		
	public void setDesktopMode(WebView webView,boolean enabled) {
		String newUserAgent = webView.getSettings().getUserAgentString();
		if (enabled) {
			try {
				String ua = webView.getSettings().getUserAgentString();
				String androidOSString = webView.getSettings().getUserAgentString().substring(ua.indexOf("("), ua.indexOf(")") + 1);
				newUserAgent = webView.getSettings().getUserAgentString().replace(androidOSString, "(X11; Linux x86_64)");
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			newUserAgent = null;
		}

		webView.getSettings().setUserAgentString(newUserAgent);
		webView.getSettings().setUseWideViewPort(enabled);
		webView.getSettings().setLoadWithOverviewMode(enabled);
		webView.reload();
	}
}
