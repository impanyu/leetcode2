//284 Peeking Iterator
// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
class PeekingIterator implements Iterator<Integer> {
    private Iterator<Integer> iterator;
    private Integer cache=null;
    private boolean ifnext=false;
     
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    this.iterator=iterator;
	    if(iterator!=null){
	       this.ifnext=iterator.hasNext()?true:false;
	       this.cache=iterator.hasNext()?iterator.next():null;
	      
	    }
	}

    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return this.cache;
	}

	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    if(!ifnext) return null;
	   Integer result= cache;
	   if(iterator.hasNext()){
	      this.cache=iterator.next();
	      this.ifnext=true;
	   }
	   else{
	      this.cache=null;
	      this.ifnext=false;
	   }
	   return result;
	}
	@Override
	public boolean hasNext() {
	    return ifnext;
	}
}