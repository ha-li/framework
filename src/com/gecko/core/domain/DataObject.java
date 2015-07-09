package com.gecko.core.domain;

abstract class DataObject implements Comparable<DataObject> {

	public int compareTo(DataObject other) {
		if(other == null) throw new NullPointerException("Invalid comparison object");
		
		else if( !(other instanceof DataObject) ) throw new IllegalArgumentException("Invalid comparison object");
		
		else {
			if(this == other) return ComparableConstant.EQUAL;
			else if( this.hashCode() == other.hashCode() ) return ComparableConstant.EQUAL;
			else if( this.hashCode() < other.hashCode() ) return ComparableConstant.BEFORE;
			else if( this.hashCode() > other.hashCode() ) return ComparableConstant.AFTER;
			else return ComparableConstant.EQUAL;
		}
	}
	
	
}
