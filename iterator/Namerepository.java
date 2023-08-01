package com.iterator;

public class Namerepository implements Container
{

	public String names[]= {"robert","john","julie","lora"};
	
	@Override
	public Iterator getiterator() 
	{
			return new Nameiterator();
	}
    
	private class Nameiterator implements Iterator
	{
        int index;
		@Override
		public boolean hasnext()
		{
		    if(index<names.length)
		    {
		    	return true;
		    }
			return false;
		}

		@Override
		public Object next() 
		{
            if(this.hasnext())
            {
               return names[index++];    	
            }
			return null;
		}
		
	}
	
	
}
