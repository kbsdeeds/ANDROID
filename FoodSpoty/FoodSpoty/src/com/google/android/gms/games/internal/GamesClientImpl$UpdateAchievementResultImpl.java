// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private static final class Xx
    implements com.google.android.gms.games.achievement._03_
{

    private final Status Eb;
    private final String Xx;

    public String getAchievementId()
    {
        return Xx;
    }

    public Status getStatus()
    {
        return Eb;
    }

    (int i, String s)
    {
        Eb = new Status(i);
        Xx = s;
    }
}
