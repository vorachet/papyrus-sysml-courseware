/**
 */
package HSUVModel.HSUVViews;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see HSUVModel.HSUVViews.HSUVViewsPackage
 * @generated
 */
public interface HSUVViewsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HSUVViewsFactory eINSTANCE = HSUVModel.HSUVViews.impl.HSUVViewsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Operational VIewpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operational VIewpoint</em>'.
	 * @generated
	 */
	OperationalVIewpoint createOperationalVIewpoint();

	/**
	 * Returns a new object of class '<em>Performance Viewpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Performance Viewpoint</em>'.
	 * @generated
	 */
	PerformanceViewpoint createPerformanceViewpoint();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HSUVViewsPackage getHSUVViewsPackage();

} //HSUVViewsFactory
