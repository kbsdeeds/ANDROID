// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.android;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.android:
//            FacebookError

public final class Util
{

    public Util()
    {
    }

    public static void clearCookies(Context context)
    {
        CookieSyncManager.createInstance(context);
        CookieManager.getInstance().removeAllCookie();
    }

    public static Bundle decodeUrl(String s)
    {
        Bundle bundle = new Bundle();
        if (s == null) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        s = s.split("&");
        j = s.length;
        i = 0;
_L5:
        if (i < j) goto _L3; else goto _L2
_L2:
        return bundle;
_L3:
        String as[] = s[i].split("=");
        bundle.putString(URLDecoder.decode(as[0]), URLDecoder.decode(as[1]));
        i++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static String encodePostBody(Bundle bundle, String s)
    {
        if (bundle == null)
        {
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder();
        Iterator iterator = bundle.keySet().iterator();
        do
        {
            String s1;
            do
            {
                if (!iterator.hasNext())
                {
                    return stringbuilder.toString();
                }
                s1 = (String)iterator.next();
            } while (bundle.getByteArray(s1) != null);
            stringbuilder.append((new StringBuilder("Content-Disposition: form-data; name=\"")).append(s1).append("\"\r\n\r\n").append(bundle.getString(s1)).toString());
            stringbuilder.append((new StringBuilder("\r\n--")).append(s).append("\r\n").toString());
        } while (true);
    }

    public static String encodeUrl(Bundle bundle)
    {
        if (bundle == null)
        {
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder();
        boolean flag = true;
        Iterator iterator = bundle.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return stringbuilder.toString();
            }
            String s = (String)iterator.next();
            if (flag)
            {
                flag = false;
            } else
            {
                stringbuilder.append("&");
            }
            stringbuilder.append((new StringBuilder(String.valueOf(URLEncoder.encode(s)))).append("=").append(URLEncoder.encode(bundle.getString(s))).toString());
        } while (true);
    }

    public static String openUrl(String s, String s1, Bundle bundle)
        throws MalformedURLException, IOException
    {
        String s2 = s;
        if (s1.equals("GET"))
        {
            s2 = (new StringBuilder(String.valueOf(s))).append("?").append(encodeUrl(bundle)).toString();
        }
        Log.d("Facebook-Util", (new StringBuilder(String.valueOf(s1))).append(" URL: ").append(s2).toString());
        s = (HttpURLConnection)(new URL(s2)).openConnection();
        s.setRequestProperty("User-Agent", (new StringBuilder(String.valueOf(System.getProperties().getProperty("http.agent")))).append(" FacebookAndroidSDK").toString());
        if (s1.equals("GET")) goto _L2; else goto _L1
_L1:
        Bundle bundle1;
        Object obj;
        bundle1 = new Bundle();
        obj = bundle.keySet().iterator();
_L7:
        if (((Iterator) (obj)).hasNext()) goto _L4; else goto _L3
_L3:
        if (!bundle.containsKey("method"))
        {
            bundle.putString("method", s1);
        }
        if (bundle.containsKey("access_token"))
        {
            bundle.putString("access_token", URLDecoder.decode(bundle.getString("access_token")));
        }
        s.setRequestMethod("POST");
        s.setRequestProperty("Content-Type", (new StringBuilder("multipart/form-data;boundary=")).append("3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f").toString());
        s.setDoOutput(true);
        s.setDoInput(true);
        s.setRequestProperty("Connection", "Keep-Alive");
        s.connect();
        s1 = new BufferedOutputStream(s.getOutputStream());
        s1.write((new StringBuilder("--")).append("3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f").append("\r\n").toString().getBytes());
        s1.write(encodePostBody(bundle, "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f").getBytes());
        s1.write((new StringBuilder(String.valueOf("\r\n"))).append("--").append("3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f").append("\r\n").toString().getBytes());
        if (bundle1.isEmpty()) goto _L6; else goto _L5
_L5:
        bundle = bundle1.keySet().iterator();
_L8:
        if (bundle.hasNext())
        {
            break MISSING_BLOCK_LABEL_410;
        }
_L6:
        s1.flush();
_L2:
        String s3;
        try
        {
            s1 = read(s.getInputStream());
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return read(s.getErrorStream());
        }
        return s1;
_L4:
        s3 = (String)((Iterator) (obj)).next();
        if (bundle.getByteArray(s3) != null)
        {
            bundle1.putByteArray(s3, bundle.getByteArray(s3));
        }
          goto _L7
        obj = (String)bundle.next();
        s1.write((new StringBuilder("Content-Disposition: form-data; filename=\"")).append(((String) (obj))).append("\"").append("\r\n").toString().getBytes());
        s1.write((new StringBuilder("Content-Type: content/unknown")).append("\r\n").append("\r\n").toString().getBytes());
        s1.write(bundle1.getByteArray(((String) (obj))));
        s1.write((new StringBuilder(String.valueOf("\r\n"))).append("--").append("3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f").append("\r\n").toString().getBytes());
          goto _L8
    }

    public static JSONObject parseJson(String s)
        throws JSONException, FacebookError
    {
        if (s.equals("false"))
        {
            throw new FacebookError("request failed");
        }
        String s1 = s;
        if (s.equals("true"))
        {
            s1 = "{value : true}";
        }
        s = new JSONObject(s1);
        if (s.has("error"))
        {
            s = s.getJSONObject("error");
            throw new FacebookError(s.getString("message"), s.getString("type"), 0);
        }
        if (s.has("error_code") && s.has("error_msg"))
        {
            throw new FacebookError(s.getString("error_msg"), "", Integer.parseInt(s.getString("error_code")));
        }
        if (s.has("error_code"))
        {
            throw new FacebookError("request failed", "", Integer.parseInt(s.getString("error_code")));
        }
        if (s.has("error_msg"))
        {
            throw new FacebookError(s.getString("error_msg"));
        }
        if (s.has("error_reason"))
        {
            throw new FacebookError(s.getString("error_reason"));
        } else
        {
            return s;
        }
    }

    public static Bundle parseUrl(String s)
    {
        s = s.replace("fbconnect", "http");
        Bundle bundle;
        try
        {
            s = new URL(s);
            bundle = decodeUrl(s.getQuery());
            bundle.putAll(decodeUrl(s.getRef()));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return new Bundle();
        }
        return bundle;
    }

    private static String read(InputStream inputstream)
        throws IOException
    {
        StringBuilder stringbuilder = new StringBuilder();
        BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(inputstream), 1000);
        String s = bufferedreader.readLine();
        do
        {
            if (s == null)
            {
                inputstream.close();
                return stringbuilder.toString();
            }
            stringbuilder.append(s);
            s = bufferedreader.readLine();
        } while (true);
    }

    public static void showAlert(Context context, String s, String s1)
    {
        context = new android.app.AlertDialog.Builder(context);
        context.setTitle(s);
        context.setMessage(s1);
        context.create().show();
    }
}
