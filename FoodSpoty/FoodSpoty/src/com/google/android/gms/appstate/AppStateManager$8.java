// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appstate;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.ib;

// Referenced classes of package com.google.android.gms.appstate:
//            AppStateManager

static final class <init> extends <init>
{

    final int DT;
    final String DW;
    final byte DX[];

    protected volatile void a(com.google.android.gms.common.api.nit> nit>)
        throws RemoteException
    {
        a((ib)nit>);
    }

    protected void a(ib ib1)
    {
        ib1.a(this, DT, DW, DX);
    }

    (GoogleApiClient googleapiclient, int i, String s, byte abyte0[])
    {
        DT = i;
        DW = s;
        DX = abyte0;
        super(googleapiclient);
    }
}
