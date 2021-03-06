/*
 * 
 */
package jacroidEMF.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class JacroidEMFNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7005;

	/**
	 * @generated
	 */
	private static final int SHORTCUTS_CATEGORY = 7004;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof jacroidEMF.diagram.navigator.JacroidEMFNavigatorItem) {
			jacroidEMF.diagram.navigator.JacroidEMFNavigatorItem item = (jacroidEMF.diagram.navigator.JacroidEMFNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return jacroidEMF.diagram.part.JacroidEMFVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
