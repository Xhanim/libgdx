/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btPairCachingGhostObject extends btGhostObject {
	private long swigCPtr;
	
	protected btPairCachingGhostObject(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, CollisionJNI.btPairCachingGhostObject_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btPairCachingGhostObject, normally you should not need this constructor it's intended for low-level usage. */
	public btPairCachingGhostObject(long cPtr, boolean cMemoryOwn) {
		this("btPairCachingGhostObject", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(CollisionJNI.btPairCachingGhostObject_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(btPairCachingGhostObject obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CollisionJNI.delete_btPairCachingGhostObject(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public btPairCachingGhostObject() {
    this(CollisionJNI.new_btPairCachingGhostObject(), true);
  }

  public void addOverlappingObjectInternal(btBroadphaseProxy otherProxy, btBroadphaseProxy thisProxy) {
    CollisionJNI.btPairCachingGhostObject_addOverlappingObjectInternal__SWIG_0(swigCPtr, this, btBroadphaseProxy.getCPtr(otherProxy), otherProxy, btBroadphaseProxy.getCPtr(thisProxy), thisProxy);
  }

  public void addOverlappingObjectInternal(btBroadphaseProxy otherProxy) {
    CollisionJNI.btPairCachingGhostObject_addOverlappingObjectInternal__SWIG_1(swigCPtr, this, btBroadphaseProxy.getCPtr(otherProxy), otherProxy);
  }

  public void removeOverlappingObjectInternal(btBroadphaseProxy otherProxy, btDispatcher dispatcher, btBroadphaseProxy thisProxy) {
    CollisionJNI.btPairCachingGhostObject_removeOverlappingObjectInternal__SWIG_0(swigCPtr, this, btBroadphaseProxy.getCPtr(otherProxy), otherProxy, btDispatcher.getCPtr(dispatcher), dispatcher, btBroadphaseProxy.getCPtr(thisProxy), thisProxy);
  }

  public void removeOverlappingObjectInternal(btBroadphaseProxy otherProxy, btDispatcher dispatcher) {
    CollisionJNI.btPairCachingGhostObject_removeOverlappingObjectInternal__SWIG_1(swigCPtr, this, btBroadphaseProxy.getCPtr(otherProxy), otherProxy, btDispatcher.getCPtr(dispatcher), dispatcher);
  }

  public btHashedOverlappingPairCache getOverlappingPairCache() {
    long cPtr = CollisionJNI.btPairCachingGhostObject_getOverlappingPairCache(swigCPtr, this);
    return (cPtr == 0) ? null : new btHashedOverlappingPairCache(cPtr, false);
  }

}
