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
		
		WebView myWebView = (WebView) findViewById(R.id.webview);
		//myWebView.loadUrl("https://screenshot-kit-r50xkn0t9.now.sh/screenshot?url=http://mitchbux.github.io&width=372&height=904");
		
		myWebView.loadUrl("https://mitchbux.github.io/screenshot.html");}
}
