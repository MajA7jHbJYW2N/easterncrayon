///////////////////////////////////////////////////////////////////////
//
// Copyright © (C) 2014
// Emory Hughes Merryman, III
// emory.merryman@gmail.com
//
// This file is part of easterncrayon.
//
// easterncrayon is free software: you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// easterncrayon is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with easterncrayon.  If not, see <http://www.gnu.org/licenses/>.
//
///////////////////////////////////////////////////////////////////////

package breezemodern . easterncrayon ;

import java . lang . annotation . Documented ;
import java . lang . annotation . Retention ;
import java . lang . annotation . Target ;

import static java . lang . annotation . ElementType . TYPE ;
import static java . lang . annotation . RetentionPolicy . SOURCE ;

@ Documented
    @ Retention ( SOURCE )
    @ Target ( TYPE )
    public @ interface Implementation
	     {
		 String value ( ) ;

		 boolean defaultPackage ( ) default false ;

		 TopLevelVisibility implementationVisibility ( ) default TopLevelVisibility . PUBLIC ;

		 Tangibility implementationTangibility ( ) default Tangibility . CONCRETE ;

		 Conformability implementationConformability ( ) default Conformability . LOOSE ;
    }
