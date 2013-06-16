 package com.androidsfuture.museumssandiego;

import java.util.ArrayList;
import java.util.List;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.androidsfuture.museumssandiego.R;
import com.google.android.maps.GeoPoint;
import com.google.android.maps.ItemizedOverlay;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapController;
import com.google.android.maps.MapView;
import com.google.android.maps.MyLocationOverlay;
import com.google.android.maps.Overlay;
import com.google.android.maps.OverlayItem;

public class MapsScience<PointLocation> extends MapActivity {
    /** Called when the activity is first created. */
	List<Overlay> mapOverlays;
	Drawable drawable;
	MuseumItemizedOverlay itemizedOverlay;
	Context mContext;
	MapView mapView;
	MyLocationOverlay me=null;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maps);

        
        mapView = (MapView) findViewById(R.id.mapview);
        mapView.setBuiltInZoomControls(true);
        
        mapOverlays = mapView.getOverlays();
        drawable = this.getResources().getDrawable(R.drawable.museum_48);
        itemizedOverlay = new MuseumItemizedOverlay(drawable);
        
        me=new MyLocationOverlay(this, mapView);
        
        me.runOnFirstFix(new Runnable() { public void run() {
            mapView.getController().animateTo(me.getMyLocation());
        }});
        
    	mapView.getOverlays().add(me);
        
        
        GeoPoint point03 = new GeoPoint((int) (32.869008*1E6), (int) (-117.246974*1E6));
        OverlayItem overlayitem03 = new OverlayItem(point03, 
        		"Birch Aquarium at Scripps", "2300 Expedition Way, La Jolla, CA 92037");
        
        GeoPoint point05 = new GeoPoint((int) (32.674284*1E6), (int) (-117.239629*1E6));
        OverlayItem overlayitem05 = new OverlayItem(point05, 
        		"Cabrillo National Monument", "1800 Cabrillo Memorial Dr, San Diego, CA 92106");
        
        GeoPoint point09 = new GeoPoint((int) (32.742751*1E6), (int) (-116.941439*1E6));
        OverlayItem overlayitem09 = new OverlayItem(point09, 
        		"Heritage of the Americas Museum", "12110 Cuyamaca College Dr. W., El Cajon, CA 92019");
        
        GeoPoint point19 = new GeoPoint((int) (32.730767*1E6), (int) (-117.146938*1E6));
        OverlayItem overlayitem19 = new OverlayItem(point19, 
        		"Reuben H. Fleet Science Center", "1875 El Prado,  San Diego, CA 92101");
        
        GeoPoint point20 = new GeoPoint((int) (32.726819*1E6), (int) (-117.153781*1E6));
        OverlayItem overlayitem20 = new OverlayItem(point20, 
        		"San Diego Air and Space Museum", "2001 Pan American Plz, San Diego, CA 92101");
        
        GeoPoint point21 = new GeoPoint((int) (33.089764*1E6), (int) (-116.976591*1E6));
        OverlayItem overlayitem21 = new OverlayItem(point21, 
        		"San Diego Archaeological Center", "16666 San Pasqual Valley Road, Escondido, CA  92027");
        
        GeoPoint point23 = new GeoPoint((int) (33.051998*1E6), (int) (-117.27919*1E6));
        OverlayItem overlayitem23 = new OverlayItem(point23, 
        		"San Diego Botanic Garden", "230 Quail Gardens Dr, Encinitas, CA 92024");
        
        GeoPoint point24 = new GeoPoint((int) (33.124517*1E6), (int) (-117.082351*1E6));
        OverlayItem overlayitem24 = new OverlayItem(point24, 
        		"San Diego Children's Discovery Museum", "320 North Broadway, Escondido, CA 92025");
        
        GeoPoint point29 = new GeoPoint((int) (32.731712*1E6), (int) (-117.152317*1E6));
        OverlayItem overlayitem29 = new OverlayItem(point29, 
        		"San Diego Museum of Man", "1350 El Prado, Balboa Park, San Diego, CA 92101");
        
        GeoPoint point30 = new GeoPoint((int) (32.732114*1E6), (int) (-117.147461*1E6));
        OverlayItem overlayitem30 = new OverlayItem(point30, 
        		"San Diego Natural History Museum", "1788 El Prado, Balboa Park, San Diego, CA");
        
        GeoPoint point31 = new GeoPoint((int) (32.737111*1E6), (int) (-117.148418*1E6));
        OverlayItem overlayitem31 = new OverlayItem(point31, 
        		"San Diego Zoo", "2920 Zoo Drive in Balboa Park, San Diego, CA");
        
        GeoPoint point32 = new GeoPoint((int) (33.096368*1E6), (int) (-117.002184*1E6));
        OverlayItem overlayitem32 = new OverlayItem(point32, 
        		"San Diego Zoo's Wild Animal Park", "15500 San Pasqual Valley Road, Escondido, California 92027");
        
        GeoPoint point33 = new GeoPoint((int) (32.710539*1E6), (int) (-117.16523*1E6));
        OverlayItem overlayitem33 = new OverlayItem(point33, 
        		"New Children's Museum", "200 West Island Avenue, San Diego, CA 92101");
        
        GeoPoint point34 = new GeoPoint((int) (32.741387*1E6), (int) (-116.939103*1E6));
        OverlayItem overlayitem34 = new OverlayItem(point34, 
        		"The Water Conservation Garden", "12122 Cuyamaca College Dr. W, El Cajon, CA 92019");
        
        GeoPoint point35 = new GeoPoint((int) (32.575554*1E6), (int) (-117.127374*1E6));
        OverlayItem overlayitem35 = new OverlayItem(point35, 
        		"Tijuana River National Estuarne Research Reserve", "301 Caspian Way, Imperial Beach, CA 91932");
        
        
        
        itemizedOverlay.addOverlay(overlayitem03);
        itemizedOverlay.addOverlay(overlayitem05);
        itemizedOverlay.addOverlay(overlayitem09);
        itemizedOverlay.addOverlay(overlayitem19);
        itemizedOverlay.addOverlay(overlayitem20);
        itemizedOverlay.addOverlay(overlayitem21);
        itemizedOverlay.addOverlay(overlayitem23);
        itemizedOverlay.addOverlay(overlayitem24);
        itemizedOverlay.addOverlay(overlayitem29);
        itemizedOverlay.addOverlay(overlayitem30);
        itemizedOverlay.addOverlay(overlayitem31);
        itemizedOverlay.addOverlay(overlayitem32);
        itemizedOverlay.addOverlay(overlayitem33);
        itemizedOverlay.addOverlay(overlayitem34);
        itemizedOverlay.addOverlay(overlayitem35);
        
        
        mapOverlays.add(itemizedOverlay);
        
		MapController mapControl = mapView.getController();
        mapControl.setCenter(itemizedOverlay.getCenter());
        mapControl.zoomToSpan(itemizedOverlay.getLatSpanE6(), itemizedOverlay.getLonSpanE6());
       
        
    }
    
        
    @Override
	public void onResume() {
		super.onResume();
		me.enableMyLocation();
		me.enableCompass();
	}		

	@Override
	public void onPause() {
		super.onPause();
		me.disableMyLocation();
		me.disableCompass();
	}
    

    protected boolean isRouteDisplayed() {
        return false;
    }
	    
	    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.map_menu, menu);
        return true;
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
        
        case R.id.Sat_View:
        	mapView.setSatellite(true);
            mapView.setStreetView(true);
            return true;
            
        case R.id.Map_View:
        	mapView.setSatellite(false);
            mapView.setStreetView(false);
            return true;
        
        case R.id.Map_Menu_All:
        	
    		startActivity(new Intent(this, Maps.class));
    		Toast.makeText(this, R.string.toast_all, Toast.LENGTH_LONG).show();
    		this.finish();
    		return true;
    		
    	case R.id.Map_Menu_Free:
    		
    		startActivity(new Intent(this, MapsFree.class));
    		Toast.makeText(this, R.string.toast_free, Toast.LENGTH_LONG).show();
    		this.finish();
    		return true;
    		
    	case R.id.Map_Menu_Art:
    		
    		startActivity(new Intent(this, MapsArt.class));
    		Toast.makeText(this, R.string.toast_art, Toast.LENGTH_LONG).show();
    		this.finish();
    		return true;
    		
    	case R.id.Map_Menu_Mansion:
    		
    		startActivity(new Intent(this, MapsMansion.class));
    		Toast.makeText(this, R.string.toast_mansion, Toast.LENGTH_LONG).show();
    		this.finish();
    		return true;
    		
    	case R.id.Map_Menu_History:
    	
    		startActivity(new Intent(this, MapsHistory.class));
    		Toast.makeText(this, R.string.toast_history, Toast.LENGTH_LONG).show();
    		this.finish();
    		return true;
    		
    	case R.id.Map_Menu_Science:
    	
    		startActivity(new Intent(this, MapsScience.class));
    		Toast.makeText(this, R.string.toast_science, Toast.LENGTH_LONG).show();
    		this.finish();
    		return true;
    		
    		
        default:
            return super.onOptionsItemSelected(item);
        }
        
        
    }   
	    
	    
    public class MuseumItemizedOverlay extends ItemizedOverlay {

    	private ArrayList<OverlayItem> mOverlays = new ArrayList<OverlayItem>();
    	
    	public MuseumItemizedOverlay(Drawable defaultMarker) {
    		super(boundCenterBottom(defaultMarker));
    		
    		// TODO Auto-generated constructor stub
    	}
    	
    	public void addOverlay(OverlayItem overlay) {
    	    mOverlays.add(overlay);
    	    populate();
    	}

    	@Override
    	protected OverlayItem createItem(int i) {
    		// TODO Auto-generated method stub
    		return mOverlays.get(i);
    	}

    	@Override
    	public int size() {
    		// TODO Auto-generated method stub
    		return mOverlays.size();
    	}
    	
    	@Override
    	protected boolean onTap(int index) {
    	
    	
    	  final OverlayItem item = mOverlays.get(index);
    	  AlertDialog.Builder dialog = new AlertDialog.Builder(MapsScience.this);
    	  dialog.setTitle(item.getTitle());
    	  dialog.setMessage(item.getSnippet());
    	  
    	  dialog.setNegativeButton("Navigate", new DialogInterface.OnClickListener() {
			
			public void onClick(DialogInterface dialog, int id) {
				startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("http://maps.google.com/maps?daddr=" + item.getSnippet())));
				
			}
		});
    	  
    	  dialog.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
			
			public void onClick(DialogInterface dialog, int id) {
				dialog.cancel();
				
			}
		});
    	  dialog.show();
    	 
    	  return true;
    	}

    }

}