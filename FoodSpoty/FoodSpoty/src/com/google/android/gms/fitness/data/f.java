// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.fitness.data:
//            DataSet, DataSource, DataType

public class f
    implements android.os.Parcelable.Creator
{

    public f()
    {
    }

    static void a(DataSet dataset, Parcel parcel, int i)
    {
        int j = b.H(parcel);
        b.a(parcel, 1, dataset.getDataSource(), i, false);
        b.c(parcel, 1000, dataset.getVersionCode());
        b.a(parcel, 2, dataset.getDataType(), i, false);
        b.d(parcel, 3, dataset.jv(), false);
        b.c(parcel, 4, dataset.jw(), false);
        b.a(parcel, 5, dataset.jn());
        b.H(parcel, j);
    }

    public DataSet bu(Parcel parcel)
    {
        boolean flag = false;
        ArrayList arraylist = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        ArrayList arraylist1 = new ArrayList();
        DataType datatype = null;
        DataSource datasource = null;
        int i = 0;
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

                case 2: // '\002'
                    datatype = (DataType)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, DataType.CREATOR);
                    break;

                case 3: // '\003'
                    com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, arraylist1, getClass().getClassLoader());
                    break;

                case 4: // '\004'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k, DataSource.CREATOR);
                    break;

                case 5: // '\005'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new DataSet(i, datasource, datatype, arraylist1, arraylist, flag);
            }
        } while (true);
    }

    public DataSet[] cN(int i)
    {
        return new DataSet[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return bu(parcel);
    }

    public Object[] newArray(int i)
    {
        return cN(i);
    }
}
