// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.DriveId;

// Referenced classes of package com.google.android.gms.drive.internal:
//            DeleteResourceRequest

public class n
    implements android.os.Parcelable.Creator
{

    public n()
    {
    }

    static void a(DeleteResourceRequest deleteresourcerequest, Parcel parcel, int i)
    {
        int j = b.H(parcel);
        b.c(parcel, 1, deleteresourcerequest.CK);
        b.a(parcel, 2, deleteresourcerequest.Pp, i, false);
        b.H(parcel, j);
    }

    public DeleteResourceRequest aj(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        int i = 0;
        DriveId driveid = null;
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
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    driveid = (DriveId)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, DriveId.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new DeleteResourceRequest(i, driveid);
            }
        } while (true);
    }

    public DeleteResourceRequest[] bu(int i)
    {
        return new DeleteResourceRequest[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return aj(parcel);
    }

    public Object[] newArray(int i)
    {
        return bu(i);
    }
}
