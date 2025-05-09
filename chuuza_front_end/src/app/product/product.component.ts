import { Component, Input } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-product',
  standalone: true,
  imports: [],
  templateUrl: './product.component.html',
  styleUrl: './product.component.css'
})
export class ProductComponent {
  @Input() productItem!: {
    productId: string;
    productImageUrl: string;
    productName:string;
    productQuantity:number;
    productPrice:number;
    productSeller:string};

    constructor(public router: Router){
    
    }
}
