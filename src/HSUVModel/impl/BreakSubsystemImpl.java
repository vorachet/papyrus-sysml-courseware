/**
 */
package HSUVModel.impl;

import HSUVModel.BrakePedal;
import HSUVModel.BreakSubsystem;
import HSUVModel.HSUVModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Break Subsystem</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link HSUVModel.impl.BreakSubsystemImpl#get_ <em></em>}</li>
 * </ul>
 *
 * @generated
 */
public class BreakSubsystemImpl extends MinimalEObjectImpl.Container implements BreakSubsystem {
	/**
	 * The cached value of the '{@link #get_() <em></em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get_()
	 * @generated
	 * @ordered
	 */
	protected BrakePedal _;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BreakSubsystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return HSUVModelPackage.Literals.BREAK_SUBSYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrakePedal get_() {
		return _;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSet_(BrakePedal new_, NotificationChain msgs) {
		BrakePedal old_ = _;
		_ = new_;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HSUVModelPackage.BREAK_SUBSYSTEM__, old_, new_);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set_(BrakePedal new_) {
		if (new_ != _) {
			NotificationChain msgs = null;
			if (_ != null)
				msgs = ((InternalEObject)_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HSUVModelPackage.BREAK_SUBSYSTEM__, null, msgs);
			if (new_ != null)
				msgs = ((InternalEObject)new_).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HSUVModelPackage.BREAK_SUBSYSTEM__, null, msgs);
			msgs = basicSet_(new_, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HSUVModelPackage.BREAK_SUBSYSTEM__, new_, new_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HSUVModelPackage.BREAK_SUBSYSTEM__:
				return basicSet_(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HSUVModelPackage.BREAK_SUBSYSTEM__:
				return get_();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HSUVModelPackage.BREAK_SUBSYSTEM__:
				set_((BrakePedal)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case HSUVModelPackage.BREAK_SUBSYSTEM__:
				set_((BrakePedal)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case HSUVModelPackage.BREAK_SUBSYSTEM__:
				return _ != null;
		}
		return super.eIsSet(featureID);
	}

} //BreakSubsystemImpl
