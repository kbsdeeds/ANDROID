// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.fitness.data.DataSource;

// Referenced classes of package com.google.android.gms.internal:
//            ms

public class mt
    implements android.os.Parcelable.Creator
{

    public mt()
    {
    }

    static void a(ms ms1, Parcel parcel, int i)
    {
        int j = b.H(parcel);
        b.a(parcel, 1, ms1.getDataSource(), i, false);
        b.c(parcel, 1000, ms1.getVersionCode());
        b.H(parcel, j);
    }

    public ms bH(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        int i = 0;
        DataSource datasource = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aH(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    datasource = (DataSource)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, DataSource.CREATOR);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new ms(i, datasource);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return bH(parcel);
    }

    public ms[] db(int i)
    {
        return new ms[i];
    }

    public Object[] newArray(int i)
    {
        return db(i);
    }
}
