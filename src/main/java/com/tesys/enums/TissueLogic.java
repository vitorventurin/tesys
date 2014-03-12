package com.tesys.enums;

import br.com.caelum.vraptor.ioc.Component;

@Component
public class TissueLogic {

        private Tissue tissue;
        
        public void select(Tissue tissue) {
                // Gostaria de fazer alguma coisa com o parametro tissue?
                //System.out.println("Tissue: " + tissue.getName());
                this.tissue = tissue;
        }

        public Tissue getTissue() {
                return this.tissue;
        }

}