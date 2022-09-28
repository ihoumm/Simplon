export class Product {

    constructor(public id: number,
                public sku: string,
                public name: string,
                public description: string,
                public price: number,
                public imageUrl: string,
                public unitsInStock: number,
                public inserted_at: Date,
                public updated_at: Date
        ) {
    }

                //  id!: number;
                //  product_sku!: string;
                //  name!: string;
                //  description!: string;
                //  unit_price!: number;
                //  image_url!: string;
                //  active!: boolean;
                //  units_in_stock!: number;
                //  inserted_at!: Date;
                //  updated_at!: Date;
}
