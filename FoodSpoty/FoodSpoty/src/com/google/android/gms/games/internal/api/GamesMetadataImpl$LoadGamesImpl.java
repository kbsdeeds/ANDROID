// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.GameBuffer;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            GamesMetadataImpl

private static abstract class <init> extends com.google.android.gms.games.oadGamesImpl
{

    public com.google.android.gms.games.oadGamesImpl S(Status status)
    {
        return new com.google.android.gms.games.GamesMetadata.LoadGamesResult(status) {

            final Status DS;
            final GamesMetadataImpl.LoadGamesImpl aaz;

            public GameBuffer getGames()
            {
                return new GameBuffer(DataHolder.av(14));
            }

            public Status getStatus()
            {
                return DS;
            }

            public void release()
            {
            }

            
            {
                aaz = GamesMetadataImpl.LoadGamesImpl.this;
                DS = status;
                super();
            }
        };
    }

    public Result c(Status status)
    {
        return S(status);
    }

    private _cls1.DS(GoogleApiClient googleapiclient)
    {
        super(googleapiclient);
    }

    _cls1.DS(GoogleApiClient googleapiclient, _cls1.DS ds)
    {
        this(googleapiclient);
    }
}
