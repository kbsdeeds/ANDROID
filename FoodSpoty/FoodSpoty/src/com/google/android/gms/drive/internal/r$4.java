// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.drive.DriveId;

// Referenced classes of package com.google.android.gms.drive.internal:
//            r, RemoveEventListenerRequest, bg, ae

class iClient extends iClient
{

    final DriveId PQ;
    final int PR;
    final r PT;

    protected volatile void a(com.google.android.gms.common.api.a a1)
        throws RemoteException
    {
        a((r)a1);
    }

    protected void a(r r1)
        throws RemoteException
    {
        r1.iG().a(new RemoveEventListenerRequest(PQ, PR), null, null, new bg(this));
    }

    iClient(r r1, GoogleApiClient googleapiclient, DriveId driveid, int i)
    {
        PT = r1;
        PQ = driveid;
        PR = i;
        super(googleapiclient);
    }
}
