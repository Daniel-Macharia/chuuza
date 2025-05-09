import { Routes } from '@angular/router';
import { ProductDetailComponent } from './product-detail/product-detail.component';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';

export const routes: Routes = [
    
    {path: "", component: HomeComponent},
    {path: "product/:product_id", component: ProductDetailComponent}
];
