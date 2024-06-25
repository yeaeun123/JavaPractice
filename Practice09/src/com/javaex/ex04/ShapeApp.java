package com.javaex.ex04;

import java.util.ArrayList;
import java.util.List;

public class ShapeApp {

    public static void main(String[] args) {
        List<Shape> sList = new ArrayList<Shape>(); 
       //List인터페이스<부모데이터타입generic>
        
        Shape r= new Rectangle( 5, 6 );
        Shape t= new RectTriangle( 6, 2 );
        sList.add(r); //요소 추가&삽입 add, 포함여부contains/삭제remove
        sList.add(t);
        
        
        for( int i=0; i<sList.size(); i++ ) {
            
            System.out.println( "area: " + sList.get(i).getArea() );
            System.out.println( "perimeter: " + sList.get(i).getPerimeter() );
            
            //만약 Resizeable을 구현했다면 Rectagle사이즈 반으로하라는 메서드(2.5, 3)
            if( sList.get(i) instanceof Resizeable ) {
                ((Resizeable)sList.get(i)).resize( 0.5 );
                
                System.out.println( "new area: " + sList.get(i).getArea() );
                System.out.println( "new perimeter: " + sList.get(i).getPerimeter() );
            }
        }
        
    }
}

