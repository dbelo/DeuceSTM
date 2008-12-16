package org.deuce.transaction.tl2.field;

import org.deuce.transform.Exclude;

/**
 * Represents a base class for field write access.  
 * @author Guy Koralnd
 */
@Exclude
public class ReadFieldAccess{
	protected Object reference;
	protected long field;
	private int hash;

	public ReadFieldAccess(){}
	
	public ReadFieldAccess( Object reference, long field){
		init(reference, field);
	}
	
	public void init( Object reference, long field){
		this.reference = reference;
		this.field = field;
		this.hash = hash(reference, field);
	}

	@Override
	public boolean equals( Object obj){
		ReadFieldAccess other = (ReadFieldAccess)obj;
		return reference == other.reference && field == other.field;
	}

	@Override
	public int hashCode(){
		return hash;
	}

	private static int hash(Object obj, long field){
		return System.identityHashCode( obj) + (int)field;
	}
}