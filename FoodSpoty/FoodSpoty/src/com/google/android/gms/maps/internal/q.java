// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.location.Location;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.d;

public interface q
    extends IInterface
{
    public static abstract class a extends Binder
        implements q
    {

        public static q bk(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMyLocationChangeListener");
            if (iinterface != null && (iinterface instanceof q))
            {
                return (q)iinterface;
            } else
            {
                return new a(ibinder);
            }
        }

        public IBinder asBinder()
        {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.maps.internal.IOnMyLocationChangeListener");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IOnMyLocationChangeListener");
                g(com.google.android.gms.dynamic.d.a.ap(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IOnMyLocationChangeListener");
                break;
            }
            if (parcel.readInt() != 0)
            {
                parcel = (Location)Location.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            c(parcel);
            parcel1.writeNoException();
            return true;
        }

        public a()
        {
            attachInterface(this, "com.google.android.gms.maps.internal.IOnMyLocationChangeListener");
        }
    }

    private static class a.a
        implements q
    {

        private IBinder le;

        public IBinder asBinder()
        {
            return le;
        }

        public void c(Location location)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMyLocationChangeListener");
            if (location == null)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            parcel.writeInt(1);
            location.writeToParcel(parcel, 0);
_L1:
            le.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            location;
            parcel1.recycle();
            parcel.recycle();
            throw location;
        }

        public void g(d d1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMyLocationChangeListener");
            if (d1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            d1 = d1.asBinder();
_L1:
            parcel.writeStrongBinder(d1);
            le.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
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


    public abstract void c(Location location)
        throws RemoteException;

    public abstract void g(d d)
        throws RemoteException;
}
