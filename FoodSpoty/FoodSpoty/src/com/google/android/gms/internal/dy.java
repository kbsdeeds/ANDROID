// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.d;

public interface dy
    extends IInterface
{
    public static abstract class a extends Binder
        implements dy
    {

        public static dy s(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
            if (iinterface != null && (iinterface instanceof dy))
            {
                return (dy)iinterface;
            } else
            {
                return new a(ibinder);
            }
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
                parcel = b(com.google.android.gms.dynamic.d.a.ap(parcel.readStrongBinder()));
                parcel1.writeNoException();
                parcel1.writeStrongBinder(parcel);
                return true;
            }
        }
    }

    private static class a.a
        implements dy
    {

        private IBinder le;

        public IBinder asBinder()
        {
            return le;
        }

        public IBinder b(d d1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
            if (d1 == null)
            {
                break MISSING_BLOCK_LABEL_63;
            }
            d1 = d1.asBinder();
_L1:
            parcel.writeStrongBinder(d1);
            le.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            d1 = parcel1.readStrongBinder();
            parcel1.recycle();
            parcel.recycle();
            return d1;
            d1 = null;
              goto _L1
            d1;
            parcel1.recycle();
            parcel.recycle();
            throw d1;
        }

        a.a(IBinder ibinder)
        {
            le = ibinder;
        }
    }


    public abstract IBinder b(d d)
        throws RemoteException;
}
