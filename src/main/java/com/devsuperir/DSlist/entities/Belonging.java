package com.devsuperir.DSlist.entities;

import java.util.Objects;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_belonging")
public class Belonging {

        @EmbeddedId //  definir uma chave primária composta em uma entidade
        private BelongingPk id = new BelongingPk();

        private Integer position;

        public Belonging (){

        }

        public Belonging (Game game, GameList list, Integer position){
            
            id.setGame(game);
            id.setLst(list);
            this.position = position;
        }

        public BelongingPk getId(){
            return id;
        }

        public void setId(BelongingPk id){
            this.id = id;
        }

        public Integer getPosition(){
            return position;
        }

        public void serPosition (Integer position){
            this.position = position;
        }


        @Override
        public int hashCode(){
            return Objects.hash(id);
        }

        @Override
        public boolean equals(Object obj){
            if (this == obj)
                return  true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Belonging other = (Belonging) obj;
            return Objects.equals(id, other.id);
        }

}
