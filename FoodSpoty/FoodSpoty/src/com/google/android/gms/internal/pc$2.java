// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.plus.internal.e;

// Referenced classes of package com.google.android.gms.internal:
//            pc

class gleApiClient extends gleApiClient
{

    final String aoa;
    final pc aoi;

    protected volatile void a(com.google.android.gms.common.api. )
        throws RemoteException
    {
        a((e));
    }

    protected void a(e e1)
    {
        a(e1.q(this, aoa));
    }

    gleApiClient(pc pc1, GoogleApiClient googleapiclient, String s)
    {
        aoi = pc1;
        aoa = s;
        super(googleapiclient, null);
    }
}