/* ==========================================
* JGraphT : a free Java graph-theory library
* ==========================================
*
* Project Info:  http://jgrapht.sourceforge.net/
* Project Creator:  Barak Naveh (http://sourceforge.net/users/barak_naveh)
*
* (C) Copyright 2003-2006, by Barak Naveh and Contributors.
*
* This library is free software; you can redistribute it and/or modify it
* under the terms of the GNU Lesser General Public License as published by
* the Free Software Foundation; either version 2.1 of the License, or
* (at your option) any later version.
*
* This library is distributed in the hope that it will be useful, but
* WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
* or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public
* License for more details.
*
* You should have received a copy of the GNU Lesser General Public License
* along with this library; if not, write to the Free Software Foundation,
* Inc.,
* 59 Temple Place, Suite 330, Boston, MA 02111-1307, USA.
*/
/* -----------------
* HelloJGraphT.java
* -----------------
* (C) Copyright 2003-2006, by Barak Naveh and Contributors.
*
* Original Author:  Barak Naveh
* Contributor(s):   -
*
* $Id: HelloJGraphT.java 504 2006-07-03 02:37:26Z perfecthash $
*
* Changes
* -------
* 27-Jul-2003 : Initial revision (BN);
*
*/
import java.net.*;

import org.jgrapht.*;
import org.jgrapht.graph.*;
import org.jgraph.JGraph;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.geom.Rectangle2D;
import java.awt.Rectangle;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JApplet;
import javax.swing.JFrame;

import org.jgraph.JGraph;
import org.jgraph.graph.DefaultGraphCell;
import org.jgraph.graph.GraphConstants;

import org.jgrapht.ListenableGraph;
import org.jgrapht.ext.JGraphModelAdapter;
import org.jgrapht.graph.ListenableDirectedGraph;
import org.jgrapht.graph.DefaultEdge;
import java.awt.*;


/**
* A simple introduction to using JGraphT.
*
* @author Barak Naveh
* @since Jul 27, 2003
*/
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JApplet;
import javax.swing.JFrame;

import org.jgraph.JGraph;
import org.jgraph.graph.DefaultGraphCell;
import org.jgraph.graph.GraphConstants;

import org.jgrapht.ListenableGraph;
import org.jgrapht.ext.JGraphModelAdapter;
import org.jgrapht.graph.ListenableDirectedGraph;
import org.jgrapht.graph.DefaultEdge;
import java.awt.*;

/**
 * A demo applet that shows how to use JGraph to visualize JGraphT graphs.
 *
 * @author Barak Naveh
 *
 * @since Aug 3, 2003
 */
public class HelloJGraphT extends Frame {
    private static final Color     DEFAULT_BG_COLOR = Color.decode( "#FAFBFF" );
    private static final Dimension DEFAULT_SIZE = new Dimension( 530, 320 );

    // 
    private JGraphModelAdapter m_jgAdapter;

    /**
     * @see java.applet.Applet#init().
     */
    public HelloJGraphT() {
        // create a JGraphT graph
        ListenableGraph g = new ListenableDirectedGraph( DefaultEdge.class );

        // create a visualization using JGraph, via an adapter
        m_jgAdapter = new JGraphModelAdapter( g );

        JGraph jgraph = new JGraph( m_jgAdapter );

        adjustDisplaySettings( jgraph );
        add( jgraph );
        resize( DEFAULT_SIZE );

        // add some sample data (graph manipulated via JGraphT)



				g.addVertex("1426");
				g.addVertex("1453");
				g.addVertex("1406");	
				g.addVertex("1446");
				g.addVertex("1409");
				g.addVertex("1438");
				g.addVertex("1396");
				g.addVertex("1440");
				g.addVertex("1417");
				g.addVertex("1407");
				g.addVertex("1424");
        
        g.addEdge( "1426", "1453" );
        g.addEdge( "1406", "1446" );
        g.addEdge( "1409", "1438" );
        g.addEdge( "1396", "1440" );
        g.addEdge( "1417", "1424" );
        g.addEdge( "1407", "1424" );
        
        // position vertices nicely within JGraph component
        positionVertexAt( "1426", 50, 50 );
        positionVertexAt( "1453", 50, 150 );
        positionVertexAt( "1406", 50, 200 );
        positionVertexAt( "1446", 50, 250 );
        positionVertexAt( "1446", 100, 250 );
        positionVertexAt( "1446", 150, 250 );
        positionVertexAt( "1446", 200, 250 );
        positionVertexAt( "1446", 200, 200 );
        positionVertexAt( "1446", 150, 200 );
        positionVertexAt( "1446", 100, 150 );
				show();
        // that's all there is to it!...
    }


    private void adjustDisplaySettings( JGraph jg ) {
        jg.setPreferredSize( DEFAULT_SIZE );

        Color  c        = DEFAULT_BG_COLOR;
        jg.setBackground( c );
    }


    private void positionVertexAt( Object vertex, int x, int y ) {
        DefaultGraphCell cell = m_jgAdapter.getVertexCell( vertex );
        Map              attr = cell.getAttributes(  );
        Rectangle2D        b    = GraphConstants.getBounds( attr );

        GraphConstants.setBounds( attr, new Rectangle( x, y, (int)b.getWidth(), (int)b.getHeight()));

        Map cellAttr = new HashMap(  );
        cellAttr.put( cell, attr );
        m_jgAdapter.edit( cellAttr, null, null, null);
    }

		public static void main(String args[]){
			HelloJGraphT gr = new HelloJGraphT();
		}
}