/**
 */
package HSUVModel.HSUVStructure.impl;

import HSUVModel.HSUVStructure.BodySubsystem;
import HSUVModel.HSUVStructure.BreakSubsystem;
import HSUVModel.HSUVStructure.ChassisSubsytem;
import HSUVModel.HSUVStructure.HSUVStructurePackage;
import HSUVModel.HSUVStructure.HybridSUV;
import HSUVModel.HSUVStructure.InteriorSubsystem;
import HSUVModel.HSUVStructure.LightingSubsystem;
import HSUVModel.HSUVStructure.PowerSubSystem;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hybrid SUV</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link HSUVModel.HSUVStructure.impl.HybridSUVImpl#getPowerSubsystem <em>Power Subsystem</em>}</li>
 *   <li>{@link HSUVModel.HSUVStructure.impl.HybridSUVImpl#getBreakSubsystem <em>Break Subsystem</em>}</li>
 *   <li>{@link HSUVModel.HSUVStructure.impl.HybridSUVImpl#getBodySubsystem <em>Body Subsystem</em>}</li>
 *   <li>{@link HSUVModel.HSUVStructure.impl.HybridSUVImpl#getInteriorSubsystem <em>Interior Subsystem</em>}</li>
 *   <li>{@link HSUVModel.HSUVStructure.impl.HybridSUVImpl#getLightingSubsystem <em>Lighting Subsystem</em>}</li>
 *   <li>{@link HSUVModel.HSUVStructure.impl.HybridSUVImpl#getChassisSubsystem <em>Chassis Subsystem</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HybridSUVImpl extends MinimalEObjectImpl.Container implements HybridSUV {
	/**
	 * The cached value of the '{@link #getPowerSubsystem() <em>Power Subsystem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerSubsystem()
	 * @generated
	 * @ordered
	 */
	protected PowerSubSystem powerSubsystem;

	/**
	 * The cached value of the '{@link #getBreakSubsystem() <em>Break Subsystem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBreakSubsystem()
	 * @generated
	 * @ordered
	 */
	protected BreakSubsystem breakSubsystem;

	/**
	 * The cached value of the '{@link #getBodySubsystem() <em>Body Subsystem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodySubsystem()
	 * @generated
	 * @ordered
	 */
	protected BodySubsystem bodySubsystem;

	/**
	 * The cached value of the '{@link #getInteriorSubsystem() <em>Interior Subsystem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteriorSubsystem()
	 * @generated
	 * @ordered
	 */
	protected InteriorSubsystem interiorSubsystem;

	/**
	 * The cached value of the '{@link #getLightingSubsystem() <em>Lighting Subsystem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLightingSubsystem()
	 * @generated
	 * @ordered
	 */
	protected LightingSubsystem lightingSubsystem;

	/**
	 * The cached value of the '{@link #getChassisSubsystem() <em>Chassis Subsystem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChassisSubsystem()
	 * @generated
	 * @ordered
	 */
	protected ChassisSubsytem chassisSubsystem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HybridSUVImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return HSUVStructurePackage.Literals.HYBRID_SUV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerSubSystem getPowerSubsystem() {
		return powerSubsystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPowerSubsystem(PowerSubSystem newPowerSubsystem, NotificationChain msgs) {
		PowerSubSystem oldPowerSubsystem = powerSubsystem;
		powerSubsystem = newPowerSubsystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HSUVStructurePackage.HYBRID_SUV__POWER_SUBSYSTEM, oldPowerSubsystem, newPowerSubsystem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPowerSubsystem(PowerSubSystem newPowerSubsystem) {
		if (newPowerSubsystem != powerSubsystem) {
			NotificationChain msgs = null;
			if (powerSubsystem != null)
				msgs = ((InternalEObject)powerSubsystem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HSUVStructurePackage.HYBRID_SUV__POWER_SUBSYSTEM, null, msgs);
			if (newPowerSubsystem != null)
				msgs = ((InternalEObject)newPowerSubsystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HSUVStructurePackage.HYBRID_SUV__POWER_SUBSYSTEM, null, msgs);
			msgs = basicSetPowerSubsystem(newPowerSubsystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HSUVStructurePackage.HYBRID_SUV__POWER_SUBSYSTEM, newPowerSubsystem, newPowerSubsystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BreakSubsystem getBreakSubsystem() {
		return breakSubsystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBreakSubsystem(BreakSubsystem newBreakSubsystem, NotificationChain msgs) {
		BreakSubsystem oldBreakSubsystem = breakSubsystem;
		breakSubsystem = newBreakSubsystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HSUVStructurePackage.HYBRID_SUV__BREAK_SUBSYSTEM, oldBreakSubsystem, newBreakSubsystem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBreakSubsystem(BreakSubsystem newBreakSubsystem) {
		if (newBreakSubsystem != breakSubsystem) {
			NotificationChain msgs = null;
			if (breakSubsystem != null)
				msgs = ((InternalEObject)breakSubsystem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HSUVStructurePackage.HYBRID_SUV__BREAK_SUBSYSTEM, null, msgs);
			if (newBreakSubsystem != null)
				msgs = ((InternalEObject)newBreakSubsystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HSUVStructurePackage.HYBRID_SUV__BREAK_SUBSYSTEM, null, msgs);
			msgs = basicSetBreakSubsystem(newBreakSubsystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HSUVStructurePackage.HYBRID_SUV__BREAK_SUBSYSTEM, newBreakSubsystem, newBreakSubsystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BodySubsystem getBodySubsystem() {
		return bodySubsystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBodySubsystem(BodySubsystem newBodySubsystem, NotificationChain msgs) {
		BodySubsystem oldBodySubsystem = bodySubsystem;
		bodySubsystem = newBodySubsystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HSUVStructurePackage.HYBRID_SUV__BODY_SUBSYSTEM, oldBodySubsystem, newBodySubsystem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBodySubsystem(BodySubsystem newBodySubsystem) {
		if (newBodySubsystem != bodySubsystem) {
			NotificationChain msgs = null;
			if (bodySubsystem != null)
				msgs = ((InternalEObject)bodySubsystem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HSUVStructurePackage.HYBRID_SUV__BODY_SUBSYSTEM, null, msgs);
			if (newBodySubsystem != null)
				msgs = ((InternalEObject)newBodySubsystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HSUVStructurePackage.HYBRID_SUV__BODY_SUBSYSTEM, null, msgs);
			msgs = basicSetBodySubsystem(newBodySubsystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HSUVStructurePackage.HYBRID_SUV__BODY_SUBSYSTEM, newBodySubsystem, newBodySubsystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteriorSubsystem getInteriorSubsystem() {
		return interiorSubsystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInteriorSubsystem(InteriorSubsystem newInteriorSubsystem, NotificationChain msgs) {
		InteriorSubsystem oldInteriorSubsystem = interiorSubsystem;
		interiorSubsystem = newInteriorSubsystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HSUVStructurePackage.HYBRID_SUV__INTERIOR_SUBSYSTEM, oldInteriorSubsystem, newInteriorSubsystem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteriorSubsystem(InteriorSubsystem newInteriorSubsystem) {
		if (newInteriorSubsystem != interiorSubsystem) {
			NotificationChain msgs = null;
			if (interiorSubsystem != null)
				msgs = ((InternalEObject)interiorSubsystem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HSUVStructurePackage.HYBRID_SUV__INTERIOR_SUBSYSTEM, null, msgs);
			if (newInteriorSubsystem != null)
				msgs = ((InternalEObject)newInteriorSubsystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HSUVStructurePackage.HYBRID_SUV__INTERIOR_SUBSYSTEM, null, msgs);
			msgs = basicSetInteriorSubsystem(newInteriorSubsystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HSUVStructurePackage.HYBRID_SUV__INTERIOR_SUBSYSTEM, newInteriorSubsystem, newInteriorSubsystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LightingSubsystem getLightingSubsystem() {
		return lightingSubsystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLightingSubsystem(LightingSubsystem newLightingSubsystem, NotificationChain msgs) {
		LightingSubsystem oldLightingSubsystem = lightingSubsystem;
		lightingSubsystem = newLightingSubsystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HSUVStructurePackage.HYBRID_SUV__LIGHTING_SUBSYSTEM, oldLightingSubsystem, newLightingSubsystem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLightingSubsystem(LightingSubsystem newLightingSubsystem) {
		if (newLightingSubsystem != lightingSubsystem) {
			NotificationChain msgs = null;
			if (lightingSubsystem != null)
				msgs = ((InternalEObject)lightingSubsystem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HSUVStructurePackage.HYBRID_SUV__LIGHTING_SUBSYSTEM, null, msgs);
			if (newLightingSubsystem != null)
				msgs = ((InternalEObject)newLightingSubsystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HSUVStructurePackage.HYBRID_SUV__LIGHTING_SUBSYSTEM, null, msgs);
			msgs = basicSetLightingSubsystem(newLightingSubsystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HSUVStructurePackage.HYBRID_SUV__LIGHTING_SUBSYSTEM, newLightingSubsystem, newLightingSubsystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChassisSubsytem getChassisSubsystem() {
		return chassisSubsystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChassisSubsystem(ChassisSubsytem newChassisSubsystem, NotificationChain msgs) {
		ChassisSubsytem oldChassisSubsystem = chassisSubsystem;
		chassisSubsystem = newChassisSubsystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HSUVStructurePackage.HYBRID_SUV__CHASSIS_SUBSYSTEM, oldChassisSubsystem, newChassisSubsystem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChassisSubsystem(ChassisSubsytem newChassisSubsystem) {
		if (newChassisSubsystem != chassisSubsystem) {
			NotificationChain msgs = null;
			if (chassisSubsystem != null)
				msgs = ((InternalEObject)chassisSubsystem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HSUVStructurePackage.HYBRID_SUV__CHASSIS_SUBSYSTEM, null, msgs);
			if (newChassisSubsystem != null)
				msgs = ((InternalEObject)newChassisSubsystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HSUVStructurePackage.HYBRID_SUV__CHASSIS_SUBSYSTEM, null, msgs);
			msgs = basicSetChassisSubsystem(newChassisSubsystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HSUVStructurePackage.HYBRID_SUV__CHASSIS_SUBSYSTEM, newChassisSubsystem, newChassisSubsystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HSUVStructurePackage.HYBRID_SUV__POWER_SUBSYSTEM:
				return basicSetPowerSubsystem(null, msgs);
			case HSUVStructurePackage.HYBRID_SUV__BREAK_SUBSYSTEM:
				return basicSetBreakSubsystem(null, msgs);
			case HSUVStructurePackage.HYBRID_SUV__BODY_SUBSYSTEM:
				return basicSetBodySubsystem(null, msgs);
			case HSUVStructurePackage.HYBRID_SUV__INTERIOR_SUBSYSTEM:
				return basicSetInteriorSubsystem(null, msgs);
			case HSUVStructurePackage.HYBRID_SUV__LIGHTING_SUBSYSTEM:
				return basicSetLightingSubsystem(null, msgs);
			case HSUVStructurePackage.HYBRID_SUV__CHASSIS_SUBSYSTEM:
				return basicSetChassisSubsystem(null, msgs);
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
			case HSUVStructurePackage.HYBRID_SUV__POWER_SUBSYSTEM:
				return getPowerSubsystem();
			case HSUVStructurePackage.HYBRID_SUV__BREAK_SUBSYSTEM:
				return getBreakSubsystem();
			case HSUVStructurePackage.HYBRID_SUV__BODY_SUBSYSTEM:
				return getBodySubsystem();
			case HSUVStructurePackage.HYBRID_SUV__INTERIOR_SUBSYSTEM:
				return getInteriorSubsystem();
			case HSUVStructurePackage.HYBRID_SUV__LIGHTING_SUBSYSTEM:
				return getLightingSubsystem();
			case HSUVStructurePackage.HYBRID_SUV__CHASSIS_SUBSYSTEM:
				return getChassisSubsystem();
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
			case HSUVStructurePackage.HYBRID_SUV__POWER_SUBSYSTEM:
				setPowerSubsystem((PowerSubSystem)newValue);
				return;
			case HSUVStructurePackage.HYBRID_SUV__BREAK_SUBSYSTEM:
				setBreakSubsystem((BreakSubsystem)newValue);
				return;
			case HSUVStructurePackage.HYBRID_SUV__BODY_SUBSYSTEM:
				setBodySubsystem((BodySubsystem)newValue);
				return;
			case HSUVStructurePackage.HYBRID_SUV__INTERIOR_SUBSYSTEM:
				setInteriorSubsystem((InteriorSubsystem)newValue);
				return;
			case HSUVStructurePackage.HYBRID_SUV__LIGHTING_SUBSYSTEM:
				setLightingSubsystem((LightingSubsystem)newValue);
				return;
			case HSUVStructurePackage.HYBRID_SUV__CHASSIS_SUBSYSTEM:
				setChassisSubsystem((ChassisSubsytem)newValue);
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
			case HSUVStructurePackage.HYBRID_SUV__POWER_SUBSYSTEM:
				setPowerSubsystem((PowerSubSystem)null);
				return;
			case HSUVStructurePackage.HYBRID_SUV__BREAK_SUBSYSTEM:
				setBreakSubsystem((BreakSubsystem)null);
				return;
			case HSUVStructurePackage.HYBRID_SUV__BODY_SUBSYSTEM:
				setBodySubsystem((BodySubsystem)null);
				return;
			case HSUVStructurePackage.HYBRID_SUV__INTERIOR_SUBSYSTEM:
				setInteriorSubsystem((InteriorSubsystem)null);
				return;
			case HSUVStructurePackage.HYBRID_SUV__LIGHTING_SUBSYSTEM:
				setLightingSubsystem((LightingSubsystem)null);
				return;
			case HSUVStructurePackage.HYBRID_SUV__CHASSIS_SUBSYSTEM:
				setChassisSubsystem((ChassisSubsytem)null);
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
			case HSUVStructurePackage.HYBRID_SUV__POWER_SUBSYSTEM:
				return powerSubsystem != null;
			case HSUVStructurePackage.HYBRID_SUV__BREAK_SUBSYSTEM:
				return breakSubsystem != null;
			case HSUVStructurePackage.HYBRID_SUV__BODY_SUBSYSTEM:
				return bodySubsystem != null;
			case HSUVStructurePackage.HYBRID_SUV__INTERIOR_SUBSYSTEM:
				return interiorSubsystem != null;
			case HSUVStructurePackage.HYBRID_SUV__LIGHTING_SUBSYSTEM:
				return lightingSubsystem != null;
			case HSUVStructurePackage.HYBRID_SUV__CHASSIS_SUBSYSTEM:
				return chassisSubsystem != null;
		}
		return super.eIsSet(featureID);
	}

} //HybridSUVImpl
