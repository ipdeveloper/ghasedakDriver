package org.osmdroid.views.overlay;

import org.osmdroid.views.MapView;

import android.view.Menu;
import android.view.MenuItem;

public interface IOverlayMenuProvider {
	boolean onCreateOptionsMenu(final Menu pMenu, final int pMenuIdOffset,
                                final MapView pMapView);

	boolean onPrepareOptionsMenu(final Menu pMenu, final int pMenuIdOffset,
                                 final MapView pMapView);

	boolean onOptionsItemSelected(final MenuItem pItem, final int pMenuIdOffset,
                                  final MapView pMapView);

	/**
	 * Can be used to signal to external callers that this Overlay should not be used for providing
	 * option menu items.
	 * 
	 */
    boolean isOptionsMenuEnabled();

	void setOptionsMenuEnabled(final boolean pOptionsMenuEnabled);
}
