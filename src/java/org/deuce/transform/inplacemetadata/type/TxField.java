package org.deuce.transform.inplacemetadata.type;

import org.deuce.transform.ExcludeTM;

@ExcludeTM
public class TxField {
	public Object ref;
	public final long address;
	
	public TxField(Object ref, long address) {
		this.ref = ref;
		this.address = address;
	}
	
	
}
