// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            d, ah, ba

private static final class istener extends d
{

    private IntentFilter axD[];
    private com.google.android.gms.wearable.geApi.MessageListener axV;

    protected volatile void a(com.google.android.gms.common.api. )
        throws RemoteException
    {
        a((ba));
    }

    protected void a(ba ba1)
        throws RemoteException
    {
        ba1.a(this, axV, axD);
        axV = null;
        axD = null;
    }

    public Status b(Status status)
    {
        axV = null;
        axD = null;
        return status;
    }

    public Result c(Status status)
    {
        return b(status);
    }

    private ent(GoogleApiClient googleapiclient, com.google.android.gms.wearable.geApi.MessageListener messagelistener, IntentFilter aintentfilter[])
    {
        super(googleapiclient);
        axV = messagelistener;
        axD = aintentfilter;
    }

    istener(GoogleApiClient googleapiclient, com.google.android.gms.wearable.geApi.MessageListener messagelistener, IntentFilter aintentfilter[], istener istener)
    {
        this(googleapiclient, messagelistener, aintentfilter);
    }
}
