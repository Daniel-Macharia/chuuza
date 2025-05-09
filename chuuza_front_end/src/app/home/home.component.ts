import { Component } from '@angular/core';
import { ProductComponent } from '../product/product.component';
import { CommonModule } from '@angular/common';

interface Product{
  "productId" : string;
  "productImageUrl": string;
  "productName":string;
  "productQuantity":number;
  "productPrice":number;
  "productSeller":string
};

@Component({
  selector: 'app-home',
  imports: [ CommonModule, ProductComponent],
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent {
  title = 'chuuza';
  public products:Product[] = [];

  constructor()
  {
    for( let i = 1; i <= 7; i++ )
    {
      this.products[i-1] = {
        "productId" : i + "",
        "productImageUrl" : "favicon.ico",
        "productName" : i + " product name here",
        "productQuantity" : 20,
        "productPrice" : 20000,
        "productSeller" : i + " Seller name here"
      };
    }
  }

  public getProducts():Product[]
  {
    return this.products;
  }
}
