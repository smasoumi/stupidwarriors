/*
 * Copyright (C) 2014 Saeed Masoumi & Saeed Rajabzade
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/**
 * this tower is for First Team
 * @author Saeed Masoumi
 */
public class blackTower extends Tower{
    public blackTower(Cell col,Cell row){
        this.row = row;
        this.col = col;
        this.attackPowerSoldier = 40;
        this.attackPowerTank = 200 ;
        this.realoadTime = 800;
        this.finalRealoadTime = 800;
        this.health = 4000;
        this.powerReflection =  30 ;
        this.cost = 500 ;
        this.range = 7;
   
    }
}
