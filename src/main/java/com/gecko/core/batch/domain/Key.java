package com.gecko.core.batch.domain;

public final class Key implements Comparable<Key> {

	public Key(int i) {
		priority = i;
	}

	private int priority;
	public int getPriority() { return priority; }
	public int priority() { return getPriority(); }	
	
	@Override
	public int compareTo(Key o) {
		if(o == null) throw new NullPointerException("Invalid comparison object");
		
		else if( !(o instanceof Key) ) throw new IllegalArgumentException("Invalid comparison object");
		
		else {
			if(this == o) return ComparableConstant.EQUAL;
			else if (this.priority < o.priority ) return ComparableConstant.BEFORE;
			else if (this.priority > o.priority ) return ComparableConstant.AFTER;
			else return ComparableConstant.EQUAL;   // get here means priority are the same
		}
	}
	
	/**
	 * Per Java specifications:  hashCode and equals are closely related,
	 *   if you override equals, you should override hashCode, and vice versa.
	 *   if a.equals(b) is true, then a.hashCode() should be same as b.hashCode()
	 *   the same fields used for equals should be used in hashCode
	 */
	
	@Override
	public boolean equals(Object o) {
		if(null == o) return false;
		
		if(this == o) return true;
		
		if( !(o instanceof Key) ) return false;
		
		Key that = (Key) o;
		
		// for orm techs you should use getters, never directly access member fields
		return that.getPriority() == getPriority();
	}
	
	
	@Override
	public int hashCode() {
		return getPriority();
	}
}
