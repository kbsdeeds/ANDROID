// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.internal.jx;

// Referenced classes of package com.google.android.gms.games.internal:
//            AbstractGamesCallbacks, GamesClientImpl

private static final class Ea extends AbstractGamesCallbacks
{

    private final com.google.android.gms.common.api.init> Ea;

    public void g(int i, String s)
    {
        Ea.Ea(new >(i, s));
    }

    (com.google.android.gms.common.api.ack ack)
    {
        Ea = (com.google.android.gms.common.api.ack.Ea)jx.b(ack, "Holder must not be null");
    }
}
