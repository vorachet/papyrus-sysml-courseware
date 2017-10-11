/**
 */
package HSUVModel.HSUVViews.impl;

import HSUVModel.HSUVViews.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HSUVViewsFactoryImpl extends EFactoryImpl implements HSUVViewsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HSUVViewsFactory init() {
		try {
			HSUVViewsFactory theHSUVViewsFactory = (HSUVViewsFactory)EPackage.Registry.INSTANCE.getEFactory(HSUVViewsPackage.eNS_URI);
			if (theHSUVViewsFactory != null) {
				return theHSUVViewsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HSUVViewsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HSUVViewsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case HSUVViewsPackage.OPERATIONAL_VIEWPOINT: return createOperationalVIewpoint();
			case HSUVViewsPackage.PERFORMANCE_VIEWPOINT: return createPerformanceViewpoint();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalVIewpoint createOperationalVIewpoint() {
		OperationalVIewpointImpl operationalVIewpoint = new OperationalVIewpointImpl();
		return operationalVIewpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformanceViewpoint createPerformanceViewpoint() {
		PerformanceViewpointImpl performanceViewpoint = new PerformanceViewpointImpl();
		return performanceViewpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HSUVViewsPackage getHSUVViewsPackage() {
		return (HSUVViewsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static HSUVViewsPackage getPackage() {
		return HSUVViewsPackage.eINSTANCE;
	}

} //HSUVViewsFactoryImpl
