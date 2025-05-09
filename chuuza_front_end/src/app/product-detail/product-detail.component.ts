import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, ParamMap } from '@angular/router';

@Component({
  selector: 'app-product-detail',
  imports: [],
  templateUrl: './product-detail.component.html',
  styleUrl: './product-detail.component.css'
})
export class ProductDetailComponent implements OnInit {
  public title = "product-specific details here";

  private productId: string = "No product id found!";

  constructor(private activatedRoute: ActivatedRoute)
  {

  }

  ngOnInit():void{
    this.activatedRoute.paramMap.subscribe(
      (params: ParamMap) => {
        let productId = params.get("product_id");
        this.productId = productId? productId : "No product Id found!";
        console.log("Received the productId: ", productId);
      }
    );
  }

  public getProductId(): string{
    return this.productId;
  }
}
