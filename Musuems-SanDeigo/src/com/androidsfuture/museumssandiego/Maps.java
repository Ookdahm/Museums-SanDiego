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

public class Maps<PointLocation> extends MapActivity {
    /** Called when the activity is first created. */
	List<Overlay> mapOverlays;
	Drawable drawable;
	MuseumItemizedOverlay itemizedOverlay;
	Context mContext;
	MyLocationOverlay me=null;
	MapView mapView;
	private static final float SQ2 = 1.414213562373095f;
	
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
        
        GeoPoint point01 = new GeoPoint((int) (32.751586*1E6), (int) (-117.194498*1E6));
        OverlayItem overlayitem01 = new OverlayItem(point01, 
        		"The Adobe Chapel Museum", "3963 Conde Street, San Diego, CA 92110");
        
        GeoPoint point02 = new GeoPoint((int) (32.942127*1E6), (int) (-116.85342*1E6));
        OverlayItem overlayitem02 = new OverlayItem(point02, 
        		"Barona Cultural Center & Museum", "1095 Barona Road, Lakeside, CA  92040");
        
        GeoPoint point03 = new GeoPoint((int) (32.869008*1E6), (int) (-117.246974*1E6));
        OverlayItem overlayitem03 = new OverlayItem(point03, 
        		"Birch Aquarium at Scripps", "2300 Expedition Way, La Jolla, CA 92037");
        
        GeoPoint point04 = new GeoPoint((int) (32.660928*1E6), (int) (-117.034481*1E6));
        OverlayItem overlayitem04 = new OverlayItem(point04, 
        		"Bonita Museum &  Cultural Center", "4355 Bonita Road, Bonita CA  91902");
        
        GeoPoint point05 = new GeoPoint((int) (32.674284*1E6), (int) (-117.239629*1E6));
        OverlayItem overlayitem05 = new OverlayItem(point05, 
        		"Cabrillo National Monument", "1800 Cabrillo Memorial Dr, San Diego, CA 92106");
        
        GeoPoint point06 = new GeoPoint((int) (33.122228*1E6), (int) (-117.084587*1E6));
        OverlayItem overlayitem06 = new OverlayItem(point06, 
        		"California Center for the Arts, Escondido", "340 N. Escondido Blvd, Escondido, CA 92025");
        
        GeoPoint point07 = new GeoPoint((int) (32.684959*1E6), (int) (-117.179899*1E6));
        OverlayItem overlayitem07 = new OverlayItem(point07, 
        		"Coronado Historical Associationa nd Museum of History and Art", "1100 Orange Ave, Coronado, CA 92118");
        
        GeoPoint point08 = new GeoPoint((int) (32.875642*1E6), (int) (-117.136579*1E6));
        OverlayItem overlayitem08 = new OverlayItem(point08, 
        		"Flying Leatherneck Historical Foundation & Aviation Museum", 
        		"Marine Corps Air Station Miramar, San Diego, CA 92145");
        
        GeoPoint point09 = new GeoPoint((int) (32.742751*1E6), (int) (-116.941439*1E6));
        OverlayItem overlayitem09 = new OverlayItem(point09, 
        		"Heritage of the Americas Museum", "12110 Cuyamaca College Dr. W., El Cajon, CA 92019");
        
        GeoPoint point10 = new GeoPoint((int) (32.845204*1E6), (int) (-117.276734*1E6));
        OverlayItem overlayitem10 = new OverlayItem(point10, 
        		"La Jolla Historical Society", "7846 Eads Avenue, La Jolla, CA  92037");
        
        GeoPoint point11 = new GeoPoint((int) (33.027709*1E6), (int) (-117.255736*1E6));
        OverlayItem overlayitem11 = new OverlayItem(point11, 
        		"Lux Art Institute", "1550 South El Camino Real, Encinitas, CA 92024");
        
        GeoPoint point12 = new GeoPoint((int) (32.720838*1E6), (int) (-117.173246*1E6));
        OverlayItem overlayitem12 = new OverlayItem(point12, 
        		"Maritime Museum of San Diego", "1492 North Harbor Dr, San Diego, CA 92101");
        
        GeoPoint point13 = new GeoPoint((int) (32.74148*1E6), (int) (-117.157597*1E6));
        OverlayItem overlayitem13 = new OverlayItem(point13, 
        		"George & Anna Marston House Museum & Gardens", "3525 Seventh Avenue, San Diego, CA 92103");
        
        GeoPoint point14 = new GeoPoint((int) (32.731436*1E6), (int) (-117.153499*1E6));
        OverlayItem overlayitem14 = new OverlayItem(point14, 
        		"Mingei Internatinal Museum", "1439 El Prado, Balboa Park, San Diego, CA 92101");
        
        GeoPoint point15 = new GeoPoint((int) (32.715792*1E6), (int) (-117.169197*1E6));
        OverlayItem overlayitem15 = new OverlayItem(point15, 
        		"Museum of Contemporary Art San Diego", "1100 & 1001 Kettner Blvd, San Diego, CA 92101");
        
        GeoPoint point16 = new GeoPoint((int) (33.12746*1E6), (int) (-117.316683*1E6));
        OverlayItem overlayitem16 = new OverlayItem(point16, 
        		"Museum of Making Music", "5790 Armada Dr, Carlsbad, CA 92008");
        
        GeoPoint point17 = new GeoPoint((int) (32.73111*1E6), (int) (-117.148621*1E6));
        OverlayItem overlayitem17 = new OverlayItem(point17, 
        		"Museum of Photographic Arts", "1649 El Prado San Diego, CA 92101");
        
        GeoPoint point18 = new GeoPoint((int) (33.197731*1E6), (int) (-117.3786981E6));
        OverlayItem overlayitem18 = new OverlayItem(point18, 
        		"Oceanside Museum of Art", "704 Pier View Way, Oceanside, CA 92054");
        
        GeoPoint point19 = new GeoPoint((int) (32.730767*1E6), (int) (-117.146938*1E6));
        OverlayItem overlayitem19 = new OverlayItem(point19, 
        		"Reuben H. Fleet Science Center", "1875 El Prado,  San Diego, CA 92101");
        
        GeoPoint point20 = new GeoPoint((int) (32.726819*1E6), (int) (-117.153781*1E6));
        OverlayItem overlayitem20 = new OverlayItem(point20, 
        		"San Diego Air and Space Museum", "2001 Pan American Plz, San Diego, CA 92101");
        
        GeoPoint point21 = new GeoPoint((int) (33.089764*1E6), (int) (-116.976591*1E6));
        OverlayItem overlayitem21 = new OverlayItem(point21, 
        		"San Diego Archaeological Center", "16666 San Pasqual Valley Road, Escondido, CA  92027");
        
        GeoPoint point22 = new GeoPoint((int) (32.727566*1E6), (int) (-117.153413*1E6));
        OverlayItem overlayitem22 = new OverlayItem(point22, 
        		"San Diego Automotive Museum", "2080 Pan American Plaza, Balboa Park, San Diego, CA 92101");
        
        GeoPoint point23 = new GeoPoint((int) (33.051998*1E6), (int) (-117.27919*1E6));
        OverlayItem overlayitem23 = new OverlayItem(point23, 
        		"San Diego Botanic Garden", "230 Quail Gardens Dr, Encinitas, CA 92024");
        
        GeoPoint point24 = new GeoPoint((int) (33.124517*1E6), (int) (-117.082351*1E6));
        OverlayItem overlayitem24 = new OverlayItem(point24, 
        		"San Diego Children's Discovery Museum", "320 North Broadway, Escondido, CA 92025");
        
        GeoPoint point25 = new GeoPoint((int) (32.727511*1E6), (int) (-117.152365*1E6));
        OverlayItem overlayitem25 = new OverlayItem(point25, 
        		"San Diego Hall of Champions", "2131 Pan American Plaza, San Diego, CA 92101");
        
        GeoPoint point26 = new GeoPoint((int) (32.759812*1E6), (int) (-117.194594*1E6));
        OverlayItem overlayitem26 = new OverlayItem(point26, 
        		"San Diego History Center: Serra Museum", "2727 Presidio Drive, San Diego, CA 92103");
        
        GeoPoint point27 = new GeoPoint((int) (32.73111*1E6), (int) (-117.148621*1E6));
        OverlayItem overlayitem27 = new OverlayItem(point27, 
        		"San Diego Model Railroad Museum", "1649 El Prado, San Diego, CA 92101");
        
        GeoPoint point28 = new GeoPoint((int) (32.731468*1E6), (int) (-117.151299*1E6));
        OverlayItem overlayitem28 = new OverlayItem(point28, 
        		"San Diego Museum of Art", "1450 El Prado, Balboa Park, San Diego, CA");
        
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
        
        GeoPoint point36 = new GeoPoint((int) (32.731464*1E6), (int) (-117.150073*1E6));
        OverlayItem overlayitem36 = new OverlayItem(point36, 
        		"Timken Museum of Art", "1500 El Prado, Balboa Park, San Diego, CA");
        
        GeoPoint point37 = new GeoPoint((int) (32.714145*1E6), (int) (-117.173098*1E6));
        OverlayItem overlayitem37 = new OverlayItem(point37, 
        		"USS Midway Museum", "910 North Harbor Dr, San Diego, CA 92101");
        
        GeoPoint point38 = new GeoPoint((int) (32.727659*1E6), (int) (-117.147312*1E6));
        OverlayItem overlayitem38 = new OverlayItem(point38, 
        		"Veterans Museum and Memorial Center", "2115 Park Blvd., San Diego, CA 92101");
        
        GeoPoint point39 = new GeoPoint((int) (32.752531*1E6), (int) (-117.194475*1E6));
        OverlayItem overlayitem39 = new OverlayItem(point39, 
        		"Whaley House Museum", "2476 San Diego Avenue, San Diego, CA 92110");
        
        GeoPoint point40 = new GeoPoint((int) (32.715546*1E6), (int) (-117.142829*1E6));
        OverlayItem overlayitem40 = new OverlayItem(point40, 
        		"The Women's History Museum and Educational Center", 
        		"2323 Broadway, Suite 107, San Diego, CA 92102");
        
        GeoPoint point41 = new GeoPoint((int) (32.749643*1E6), (int) (-117.150813*1E6));
        OverlayItem overlayitem41 = new OverlayItem(point41, 
        		"San Diego Museum Council", "San Diego Museum Council, P.O. Box 3836, San Diego, CA 92163");
        
        
        
        itemizedOverlay.addOverlay(overlayitem01);
        itemizedOverlay.addOverlay(overlayitem02);
        itemizedOverlay.addOverlay(overlayitem03);
        itemizedOverlay.addOverlay(overlayitem04);
        itemizedOverlay.addOverlay(overlayitem05);
        itemizedOverlay.addOverlay(overlayitem06);
        itemizedOverlay.addOverlay(overlayitem07);
        itemizedOverlay.addOverlay(overlayitem08);
        itemizedOverlay.addOverlay(overlayitem09);
        itemizedOverlay.addOverlay(overlayitem10);
        itemizedOverlay.addOverlay(overlayitem11);
        itemizedOverlay.addOverlay(overlayitem12);
        itemizedOverlay.addOverlay(overlayitem13);
        itemizedOverlay.addOverlay(overlayitem14);
        itemizedOverlay.addOverlay(overlayitem15);
        itemizedOverlay.addOverlay(overlayitem16);
        itemizedOverlay.addOverlay(overlayitem17);
        itemizedOverlay.addOverlay(overlayitem18);
        itemizedOverlay.addOverlay(overlayitem19);
        itemizedOverlay.addOverlay(overlayitem20);
        itemizedOverlay.addOverlay(overlayitem21);
        itemizedOverlay.addOverlay(overlayitem22);
        itemizedOverlay.addOverlay(overlayitem23);
        itemizedOverlay.addOverlay(overlayitem24);
        itemizedOverlay.addOverlay(overlayitem25);
        itemizedOverlay.addOverlay(overlayitem26);
        itemizedOverlay.addOverlay(overlayitem27);
        itemizedOverlay.addOverlay(overlayitem28);
        itemizedOverlay.addOverlay(overlayitem29);
        itemizedOverlay.addOverlay(overlayitem30);
        itemizedOverlay.addOverlay(overlayitem31);
        itemizedOverlay.addOverlay(overlayitem32);
        itemizedOverlay.addOverlay(overlayitem33);
        itemizedOverlay.addOverlay(overlayitem34);
        itemizedOverlay.addOverlay(overlayitem35);
        itemizedOverlay.addOverlay(overlayitem36);
        itemizedOverlay.addOverlay(overlayitem37);
        itemizedOverlay.addOverlay(overlayitem38);
        itemizedOverlay.addOverlay(overlayitem39);
        itemizedOverlay.addOverlay(overlayitem40);
        itemizedOverlay.addOverlay(overlayitem41);
        
        mapOverlays.add(itemizedOverlay);
        
        MapController mapControl = mapView.getController();
        mapControl.setCenter(itemizedOverlay.getCenter());
        mapControl.zoomToSpan(itemizedOverlay.getLatSpanE6(), itemizedOverlay.getLonSpanE6());
        mapControl.setZoom(21);
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
    		
    	case R.id.Map_Menu_Me:
    		
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
    	  AlertDialog.Builder dialog = new AlertDialog.Builder(Maps.this);
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