/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.dewords.pope;
public interface IDebugLogServiceCallback extends android.os.IInterface
{
  /** Default implementation for IDebugLogServiceCallback. */
  public static class Default implements com.dewords.pope.IDebugLogServiceCallback
  {
    @Override public void onStarted(java.util.List<java.lang.String> logList) throws android.os.RemoteException
    {
    }
    @Override public void onStopped() throws android.os.RemoteException
    {
    }
    @Override public void onLog(java.lang.String msg) throws android.os.RemoteException
    {
    }
    @Override public void onSaved(boolean success, java.lang.String path) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.dewords.pope.IDebugLogServiceCallback
  {
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.dewords.pope.IDebugLogServiceCallback interface,
     * generating a proxy if needed.
     */
    public static com.dewords.pope.IDebugLogServiceCallback asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.dewords.pope.IDebugLogServiceCallback))) {
        return ((com.dewords.pope.IDebugLogServiceCallback)iin);
      }
      return new com.dewords.pope.IDebugLogServiceCallback.Stub.Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      java.lang.String descriptor = DESCRIPTOR;
      if (code >= android.os.IBinder.FIRST_CALL_TRANSACTION && code <= android.os.IBinder.LAST_CALL_TRANSACTION) {
        data.enforceInterface(descriptor);
      }
      switch (code)
      {
        case INTERFACE_TRANSACTION:
        {
          reply.writeString(descriptor);
          return true;
        }
      }
      switch (code)
      {
        case TRANSACTION_onStarted:
        {
          java.util.List<java.lang.String> _arg0;
          _arg0 = data.createStringArrayList();
          this.onStarted(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_onStopped:
        {
          this.onStopped();
          reply.writeNoException();
          break;
        }
        case TRANSACTION_onLog:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          this.onLog(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_onSaved:
        {
          boolean _arg0;
          _arg0 = (0!=data.readInt());
          java.lang.String _arg1;
          _arg1 = data.readString();
          this.onSaved(_arg0, _arg1);
          reply.writeNoException();
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static class Proxy implements com.dewords.pope.IDebugLogServiceCallback
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public java.lang.String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      @Override public void onStarted(java.util.List<java.lang.String> logList) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStringList(logList);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onStarted, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void onStopped() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onStopped, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void onLog(java.lang.String msg) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(msg);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onLog, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void onSaved(boolean success, java.lang.String path) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(((success)?(1):(0)));
          _data.writeString(path);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onSaved, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
    }
    static final int TRANSACTION_onStarted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_onStopped = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_onLog = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_onSaved = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
  }
  public static final java.lang.String DESCRIPTOR = "com.dewords.pope.IDebugLogServiceCallback";
  public void onStarted(java.util.List<java.lang.String> logList) throws android.os.RemoteException;
  public void onStopped() throws android.os.RemoteException;
  public void onLog(java.lang.String msg) throws android.os.RemoteException;
  public void onSaved(boolean success, java.lang.String path) throws android.os.RemoteException;
}
