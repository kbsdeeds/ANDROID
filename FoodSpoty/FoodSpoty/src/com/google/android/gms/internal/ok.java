// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            oj

public interface ok
    extends IInterface
{
    public static abstract class a extends Binder
        implements ok
    {

        public static ok bG(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.panorama.internal.IPanoramaService");
            if (iinterface != null && (iinterface instanceof ok))
            {
                return (ok)iinterface;
            } else
            {
                return new a(ibinder);
            }
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            oj oj;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.panorama.internal.IPanoramaService");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.panorama.internal.IPanoramaService");
                oj = com.google.android.gms.internal.oj.a.bF(parcel.readStrongBinder());
                break;
            }
            Bundle bundle;
            boolean flag;
            if (parcel.readInt() != 0)
            {
                parcel1 = (Uri)Uri.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel1 = null;
            }
            if (parcel.readInt() != 0)
            {
                bundle = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                bundle = null;
            }
            if (parcel.readInt() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a(oj, parcel1, bundle, flag);
            return true;
        }
    }

    private static class a.a
        implements ok
    {

        private IBinder le;

        public void a(oj oj1, Uri uri, Bundle bundle, boolean flag)
            throws RemoteException
        {
            IBinder ibinder;
            Parcel parcel;
            int i;
            ibinder = null;
            i = 1;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.panorama.internal.IPanoramaService");
            if (oj1 == null)
            {
                break MISSING_BLOCK_LABEL_30;
            }
            ibinder = oj1.asBinder();
            parcel.writeStrongBinder(ibinder);
            if (uri == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            uri.writeToParcel(parcel, 0);
_L5:
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
            break MISSING_BLOCK_LABEL_128;
_L6:
            parcel.writeInt(i);
            le.transact(1, parcel, null, 1);
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L5
            oj1;
            parcel.recycle();
            throw oj1;
_L4:
            parcel.writeInt(0);
            while (!flag) 
            {
                i = 0;
                break;
            }
              goto _L6
        }

        public IBinder asBinder()
        {
            return le;
        }

        a.a(IBinder ibinder)
        {
            le = ibinder;
        }
    }


    public abstract void a(oj oj, Uri uri, Bundle bundle, boolean flag)
        throws RemoteException;
}
