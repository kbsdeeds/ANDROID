// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.service;

import android.app.AppOpsManager;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.result.DataSourcesResult;
import com.google.android.gms.internal.ll;
import com.google.android.gms.internal.lx;
import com.google.android.gms.internal.md;
import com.google.android.gms.internal.mq;
import com.google.android.gms.internal.ms;

// Referenced classes of package com.google.android.gms.fitness.service:
//            FitnessSensorService, FitnessSensorServiceRequest

private static class <init> extends com.google.android.gms.internal.vice.a
{

    private final FitnessSensorService Wx;

    private void kw()
        throws SecurityException
    {
        int i = Binder.getCallingUid();
        if (!ll.im()) goto _L2; else goto _L1
_L1:
        ((AppOpsManager)Wx.getSystemService("appops")).checkPackage(i, "com.google.android.gms");
_L4:
        return;
_L2:
label0:
        {
            String as[] = Wx.getPackageManager().getPackagesForUid(i);
            if (as == null)
            {
                break label0;
            }
            int j = as.length;
            i = 0;
            do
            {
                if (i >= j)
                {
                    break label0;
                }
                if (as[i].equals("com.google.android.gms"))
                {
                    break;
                }
                i++;
            } while (true);
        }
        if (true) goto _L4; else goto _L3
_L3:
        throw new SecurityException("Unauthorized caller");
    }

    public void a(FitnessSensorServiceRequest fitnesssensorservicerequest, md md1)
        throws RemoteException
    {
        kw();
        if (Wx.onRegister(fitnesssensorservicerequest))
        {
            md1.j(Status.Kw);
            return;
        } else
        {
            md1.j(new Status(13));
            return;
        }
    }

    public void a(mq mq1, lx lx1)
        throws RemoteException
    {
        kw();
        lx1.a(new DataSourcesResult(Wx.onFindDataSources(mq1.getDataTypes()), Status.Kw));
    }

    public void a(ms ms1, md md1)
        throws RemoteException
    {
        kw();
        if (Wx.onUnregister(ms1.getDataSource()))
        {
            md1.j(Status.Kw);
            return;
        } else
        {
            md1.j(new Status(13));
            return;
        }
    }

    private uest(FitnessSensorService fitnesssensorservice)
    {
        Wx = fitnesssensorservice;
    }

    Wx(FitnessSensorService fitnesssensorservice, Wx wx)
    {
        this(fitnesssensorservice);
    }
}
